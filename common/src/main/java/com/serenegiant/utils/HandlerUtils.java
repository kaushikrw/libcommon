package com.serenegiant.utils;
/*
 * libcommon
 * utility/helper classes for myself
 *
 * Copyright (c) 2014-2021 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/

import android.os.Handler;

import androidx.annotation.Nullable;

/**
 * Handler用のユーティリティクラス
 */
public class HandlerUtils {
	private static final boolean DEBUG = false;	// set false on production
	private static final String TAG = HandlerUtils.class.getSimpleName();

	private HandlerUtils() {
		// インスタンス化を防止するためにデフォルトコンストラクタをprivateにする
	}

	/**
	 * 指定したHandlerが終了している(メッセージ送信・Runnable実行等を受け付けない)かどうかを取得
	 * このメソッドを実行するとsendEmptyMessageでwhat=0を送信する可能性があるので注意
	 * @param handler
	 * @return
	 */
	public static boolean isTerminated(@Nullable final Handler handler) {
		// Handler#getLooperとLooper#getThreadはNonNullなのでHandlerがnullでなければthread変数もnullじゃない
		final Thread thread = handler != null ? handler.getLooper().getThread() : null;
		// XXX sendEmptyMessageでwhat=0を送って返り値がfalseならHandler/Looperが終了しているとみなす
		return (handler == null) || (thread == null)
			|| !thread.isAlive() || !handler.sendEmptyMessage(0);
	}
}
