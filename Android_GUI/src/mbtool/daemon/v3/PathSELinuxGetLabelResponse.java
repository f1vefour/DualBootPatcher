// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PathSELinuxGetLabelResponse extends Table {
  public static PathSELinuxGetLabelResponse getRootAsPathSELinuxGetLabelResponse(ByteBuffer _bb) { return getRootAsPathSELinuxGetLabelResponse(_bb, new PathSELinuxGetLabelResponse()); }
  public static PathSELinuxGetLabelResponse getRootAsPathSELinuxGetLabelResponse(ByteBuffer _bb, PathSELinuxGetLabelResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PathSELinuxGetLabelResponse __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String errorMsg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer errorMsgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String label() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer labelAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }

  public static int createPathSELinuxGetLabelResponse(FlatBufferBuilder builder,
      boolean success,
      int error_msg,
      int label) {
    builder.startObject(3);
    PathSELinuxGetLabelResponse.addLabel(builder, label);
    PathSELinuxGetLabelResponse.addErrorMsg(builder, error_msg);
    PathSELinuxGetLabelResponse.addSuccess(builder, success);
    return PathSELinuxGetLabelResponse.endPathSELinuxGetLabelResponse(builder);
  }

  public static void startPathSELinuxGetLabelResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addErrorMsg(FlatBufferBuilder builder, int errorMsgOffset) { builder.addOffset(1, errorMsgOffset, 0); }
  public static void addLabel(FlatBufferBuilder builder, int labelOffset) { builder.addOffset(2, labelOffset, 0); }
  public static int endPathSELinuxGetLabelResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

