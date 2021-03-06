// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PathSELinuxGetLabelRequest extends Table {
  public static PathSELinuxGetLabelRequest getRootAsPathSELinuxGetLabelRequest(ByteBuffer _bb) { return getRootAsPathSELinuxGetLabelRequest(_bb, new PathSELinuxGetLabelRequest()); }
  public static PathSELinuxGetLabelRequest getRootAsPathSELinuxGetLabelRequest(ByteBuffer _bb, PathSELinuxGetLabelRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PathSELinuxGetLabelRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String path() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pathAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public boolean followSymlinks() { int o = __offset(6); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createPathSELinuxGetLabelRequest(FlatBufferBuilder builder,
      int path,
      boolean follow_symlinks) {
    builder.startObject(2);
    PathSELinuxGetLabelRequest.addPath(builder, path);
    PathSELinuxGetLabelRequest.addFollowSymlinks(builder, follow_symlinks);
    return PathSELinuxGetLabelRequest.endPathSELinuxGetLabelRequest(builder);
  }

  public static void startPathSELinuxGetLabelRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addPath(FlatBufferBuilder builder, int pathOffset) { builder.addOffset(0, pathOffset, 0); }
  public static void addFollowSymlinks(FlatBufferBuilder builder, boolean followSymlinks) { builder.addBoolean(1, followSymlinks, false); }
  public static int endPathSELinuxGetLabelRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

