// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: init_copy_constant.proto

package cn.com.unary.initcopy.grpc.constant;

public final class IC_Constant {
  private IC_Constant() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030init_copy_constant.proto\022#cn.com.unary" +
      ".initcopy.grpc.constant*\'\n\010SyncType\022\014\n\010S" +
      "YNC_ALL\020\000\022\r\n\tSYNC_DIFF\020\001*4\n\014CompressType" +
      "\022\021\n\rCOMPRESS_NONE\020\000\022\021\n\rCOMPRESS_ZLIB\020\001*0" +
      "\n\013EncryptType\022\020\n\014ENCRYPT_NONE\020\000\022\017\n\013ENCRY" +
      "PT_AES\020\001**\n\010PackType\022\r\n\tPACK_NONE\020\000\022\017\n\013P" +
      "ACK_FORMAT\020\001*3\n\nModifyType\022\t\n\005PAUSE\020\000\022\t\n" +
      "\005START\020\001\022\017\n\013SPEED_LIMIT\020\002B4\n#cn.com.unar" +
      "y.initcopy.grpc.constantB\013IC_ConstantP\001b" +
      "\006proto3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
