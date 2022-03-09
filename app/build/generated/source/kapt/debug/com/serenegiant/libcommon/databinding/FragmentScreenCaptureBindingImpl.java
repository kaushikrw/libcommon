package com.serenegiant.libcommon.databinding;
import com.serenegiant.libcommon.R;
import com.serenegiant.libcommon.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentScreenCaptureBindingImpl extends FragmentScreenCaptureBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener recordingButtonandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.isChecked.getValue()
            //         is viewModel.isChecked.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = recordingButton.isChecked();
            // localize variables for thread safety
            // viewModel.isChecked.getValue()
            java.lang.Boolean viewModelIsCheckedGetValue = null;
            // viewModel
            com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel viewModel = mViewModel;
            // viewModel.isChecked
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsChecked = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.isChecked != null
            boolean viewModelIsCheckedJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelIsChecked = viewModel.isChecked();

                viewModelIsCheckedJavaLangObjectNull = (viewModelIsChecked) != (null);
                if (viewModelIsCheckedJavaLangObjectNull) {




                    viewModelIsChecked.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentScreenCaptureBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentScreenCaptureBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.ToggleButton) bindings[1]
            );
        this.frame.setTag(null);
        this.recordingButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRecordingLabel((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsChecked((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRecordingLabel(androidx.lifecycle.LiveData<java.lang.String> ViewModelRecordingLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsChecked(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsChecked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelRecordingLabelGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelRecordingLabel = null;
        java.lang.Boolean viewModelIsCheckedGetValue = null;
        com.serenegiant.libcommon.viewmodel.ScreenCaptureViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsChecked = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsCheckedGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recordingLabel
                        viewModelRecordingLabel = viewModel.getRecordingLabel();
                    }
                    updateLiveDataRegistration(0, viewModelRecordingLabel);


                    if (viewModelRecordingLabel != null) {
                        // read viewModel.recordingLabel.getValue()
                        viewModelRecordingLabelGetValue = viewModelRecordingLabel.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isChecked
                        viewModelIsChecked = viewModel.isChecked();
                    }
                    updateLiveDataRegistration(1, viewModelIsChecked);


                    if (viewModelIsChecked != null) {
                        // read viewModel.isChecked.getValue()
                        viewModelIsCheckedGetValue = viewModelIsChecked.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isChecked.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsCheckedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsCheckedGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.recordingButton, androidxDatabindingViewDataBindingSafeUnboxViewModelIsCheckedGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recordingButton, viewModelRecordingLabelGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.recordingButton, (android.widget.CompoundButton.OnCheckedChangeListener)null, recordingButtonandroidCheckedAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.recordingLabel
        flag 1 (0x2L): viewModel.isChecked
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}