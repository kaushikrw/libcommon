package com.serenegiant.libcommon;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.serenegiant.libcommon.databinding.FragmentSafFilerBindingImpl;
import com.serenegiant.libcommon.databinding.FragmentSafutilsBindingImpl;
import com.serenegiant.libcommon.databinding.FragmentScreenCaptureBindingImpl;
import com.serenegiant.libcommon.databinding.FragmentSettingsLinkBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTSAFFILER = 1;

  private static final int LAYOUT_FRAGMENTSAFUTILS = 2;

  private static final int LAYOUT_FRAGMENTSCREENCAPTURE = 3;

  private static final int LAYOUT_FRAGMENTSETTINGSLINK = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.serenegiant.libcommon.R.layout.fragment_saf_filer, LAYOUT_FRAGMENTSAFFILER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.serenegiant.libcommon.R.layout.fragment_safutils, LAYOUT_FRAGMENTSAFUTILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.serenegiant.libcommon.R.layout.fragment_screen_capture, LAYOUT_FRAGMENTSCREENCAPTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.serenegiant.libcommon.R.layout.fragment_settings_link, LAYOUT_FRAGMENTSETTINGSLINK);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTSAFFILER: {
          if ("layout/fragment_saf_filer_0".equals(tag)) {
            return new FragmentSafFilerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_saf_filer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSAFUTILS: {
          if ("layout/fragment_safutils_0".equals(tag)) {
            return new FragmentSafutilsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_safutils is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCREENCAPTURE: {
          if ("layout/fragment_screen_capture_0".equals(tag)) {
            return new FragmentScreenCaptureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_screen_capture is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGSLINK: {
          if ("layout/fragment_settings_link_0".equals(tag)) {
            return new FragmentSettingsLinkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings_link is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "onClickListener");
      sKeys.put(2, "requestCode");
      sKeys.put(3, "requestCodeString");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_saf_filer_0", com.serenegiant.libcommon.R.layout.fragment_saf_filer);
      sKeys.put("layout/fragment_safutils_0", com.serenegiant.libcommon.R.layout.fragment_safutils);
      sKeys.put("layout/fragment_screen_capture_0", com.serenegiant.libcommon.R.layout.fragment_screen_capture);
      sKeys.put("layout/fragment_settings_link_0", com.serenegiant.libcommon.R.layout.fragment_settings_link);
    }
  }
}
