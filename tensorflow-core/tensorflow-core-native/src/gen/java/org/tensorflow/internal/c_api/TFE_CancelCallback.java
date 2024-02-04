// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;

@Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TFE_CancelCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TFE_CancelCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TFE_CancelCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_CancelCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TFE_CancelCallback position(long position) {
        return (TFE_CancelCallback)super.position(position);
    }
    @Override public TFE_CancelCallback getPointer(long i) {
        return new TFE_CancelCallback((Pointer)this).offsetAddress(i);
    }

  public static class Callback_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Callback_Pointer(Pointer p) { super(p); }
      protected Callback_Pointer() { allocate(); }
      private native void allocate();
      public native void call(Pointer context);
  }
  public native Callback_Pointer callback(); public native TFE_CancelCallback callback(Callback_Pointer setter);
  public native Pointer context(); public native TFE_CancelCallback context(Pointer setter);
}
