// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightsDevice.proto

package LightsDevice.proto.li;

public final class ClassName {
  private ClassName() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsDevice_Lights_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsDevice_Lights_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsDevice_light_status_request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsDevice_light_status_request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsDevice_lightToUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsDevice_lightToUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsDevice_lightStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsDevice_lightStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LightsDevice_lightDetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LightsDevice_lightDetailResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LightsDevice.proto\022\014LightsDevice\"H\n\006Li" +
      "ghts\022\020\n\010light_id\030\001 \001(\005\022\026\n\016light_location" +
      "\030\002 \001(\t\022\024\n\014light_status\030\003 \001(\t\"(\n\024light_st" +
      "atus_request\022\020\n\010light_id\030\001 \001(\005\"(\n\024lightT" +
      "oUpdateRequest\022\020\n\010light_id\030\001 \001(\005\";\n\023ligh" +
      "tStatusResponse\022$\n\006lights\030\001 \001(\0132\024.Lights" +
      "Device.Lights\";\n\023lightDetailResponse\022$\n\006" +
      "lights\030\001 \001(\0132\024.LightsDevice.Lights2\221\002\n\rL" +
      "ightsService\022U\n\nshowStatus\022\".LightsDevic" +
      "e.light_status_request\032!.LightsDevice.li" +
      "ghtStatusResponse\"\000\022S\n\010lightsOn\022\".Lights" +
      "Device.lightToUpdateRequest\032!.LightsDevi" +
      "ce.lightDetailResponse\"\000\022T\n\tlightsOff\022\"." +
      "LightsDevice.lightToUpdateRequest\032!.Ligh" +
      "tsDevice.lightDetailResponse\"\000B$\n\025Lights" +
      "Device.proto.liB\tClassNameP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_LightsDevice_Lights_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LightsDevice_Lights_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsDevice_Lights_descriptor,
        new java.lang.String[] { "LightId", "LightLocation", "LightStatus", });
    internal_static_LightsDevice_light_status_request_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LightsDevice_light_status_request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsDevice_light_status_request_descriptor,
        new java.lang.String[] { "LightId", });
    internal_static_LightsDevice_lightToUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LightsDevice_lightToUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsDevice_lightToUpdateRequest_descriptor,
        new java.lang.String[] { "LightId", });
    internal_static_LightsDevice_lightStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_LightsDevice_lightStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsDevice_lightStatusResponse_descriptor,
        new java.lang.String[] { "Lights", });
    internal_static_LightsDevice_lightDetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_LightsDevice_lightDetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LightsDevice_lightDetailResponse_descriptor,
        new java.lang.String[] { "Lights", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
