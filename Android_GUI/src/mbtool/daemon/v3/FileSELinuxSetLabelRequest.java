// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileSELinuxSetLabelRequest extends Table {
  public static FileSELinuxSetLabelRequest getRootAsFileSELinuxSetLabelRequest(ByteBuffer _bb) { return getRootAsFileSELinuxSetLabelRequest(_bb, new FileSELinuxSetLabelRequest()); }
  public static FileSELinuxSetLabelRequest getRootAsFileSELinuxSetLabelRequest(ByteBuffer _bb, FileSELinuxSetLabelRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FileSELinuxSetLabelRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String label() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer labelAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createFileSELinuxSetLabelRequest(FlatBufferBuilder builder,
      int id,
      int label) {
    builder.startObject(2);
    FileSELinuxSetLabelRequest.addLabel(builder, label);
    FileSELinuxSetLabelRequest.addId(builder, id);
    return FileSELinuxSetLabelRequest.endFileSELinuxSetLabelRequest(builder);
  }

  public static void startFileSELinuxSetLabelRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addLabel(FlatBufferBuilder builder, int labelOffset) { builder.addOffset(1, labelOffset, 0); }
  public static int endFileSELinuxSetLabelRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

