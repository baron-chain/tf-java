// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// APIs for generically dealing with op attributes (e.g. when forwarding them
// through custom device implementations).
//
// TODO(allenl): Currently these are black boxes, but we should have some way to
// inspect values. This would let people e.g. copy over most attributes and then
// modify some based on their values.

// A reference to an op's name -> attribute mapping
@Opaque @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TFE_OpAttrs extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TFE_OpAttrs() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_OpAttrs(Pointer p) { super(p); }
}
