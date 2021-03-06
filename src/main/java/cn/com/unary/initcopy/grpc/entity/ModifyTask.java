// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: init_copy_entity.proto

package cn.com.unary.initcopy.grpc.entity;

/**
 * <pre>
 * 修改任务 只支持修改限速
 * </pre>
 *
 * Protobuf type {@code cn.com.unary.initcopy.grpc.entity.ModifyTask}
 */
public  final class ModifyTask extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.com.unary.initcopy.grpc.entity.ModifyTask)
    ModifyTaskOrBuilder {
  // Use ModifyTask.newBuilder() to construct.
  private ModifyTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyTask() {
    taskId_ = "";
    modifyType_ = 0;
    speedLimit_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ModifyTask(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            taskId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            modifyType_ = rawValue;
            break;
          }
          case 24: {

            speedLimit_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_ModifyTask_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_ModifyTask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.com.unary.initcopy.grpc.entity.ModifyTask.class, cn.com.unary.initcopy.grpc.entity.ModifyTask.Builder.class);
  }

  public static final int TASKID_FIELD_NUMBER = 1;
  private volatile java.lang.Object taskId_;
  /**
   * <pre>
   *对应的任务id
   * </pre>
   *
   * <code>optional string taskId = 1;</code>
   */
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *对应的任务id
   * </pre>
   *
   * <code>optional string taskId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODIFYTYPE_FIELD_NUMBER = 2;
  private int modifyType_;
  /**
   * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
   */
  public int getModifyTypeValue() {
    return modifyType_;
  }
  /**
   * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
   */
  public cn.com.unary.initcopy.grpc.constant.ModifyType getModifyType() {
    cn.com.unary.initcopy.grpc.constant.ModifyType result = cn.com.unary.initcopy.grpc.constant.ModifyType.valueOf(modifyType_);
    return result == null ? cn.com.unary.initcopy.grpc.constant.ModifyType.UNRECOGNIZED : result;
  }

  public static final int SPEEDLIMIT_FIELD_NUMBER = 3;
  private int speedLimit_;
  /**
   * <pre>
   *限速 以M为单位  0为不限速
   * </pre>
   *
   * <code>optional int32 speedLimit = 3;</code>
   */
  public int getSpeedLimit() {
    return speedLimit_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTaskIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, taskId_);
    }
    if (modifyType_ != cn.com.unary.initcopy.grpc.constant.ModifyType.PAUSE.getNumber()) {
      output.writeEnum(2, modifyType_);
    }
    if (speedLimit_ != 0) {
      output.writeInt32(3, speedLimit_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTaskIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, taskId_);
    }
    if (modifyType_ != cn.com.unary.initcopy.grpc.constant.ModifyType.PAUSE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, modifyType_);
    }
    if (speedLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, speedLimit_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.com.unary.initcopy.grpc.entity.ModifyTask)) {
      return super.equals(obj);
    }
    cn.com.unary.initcopy.grpc.entity.ModifyTask other = (cn.com.unary.initcopy.grpc.entity.ModifyTask) obj;

    boolean result = true;
    result = result && getTaskId()
        .equals(other.getTaskId());
    result = result && modifyType_ == other.modifyType_;
    result = result && (getSpeedLimit()
        == other.getSpeedLimit());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TASKID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    hash = (37 * hash) + MODIFYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + modifyType_;
    hash = (37 * hash) + SPEEDLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getSpeedLimit();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.ModifyTask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.com.unary.initcopy.grpc.entity.ModifyTask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 修改任务 只支持修改限速
   * </pre>
   *
   * Protobuf type {@code cn.com.unary.initcopy.grpc.entity.ModifyTask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.com.unary.initcopy.grpc.entity.ModifyTask)
      cn.com.unary.initcopy.grpc.entity.ModifyTaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_ModifyTask_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_ModifyTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.com.unary.initcopy.grpc.entity.ModifyTask.class, cn.com.unary.initcopy.grpc.entity.ModifyTask.Builder.class);
    }

    // Construct using cn.com.unary.initcopy.grpc.entity.ModifyTask.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      taskId_ = "";

      modifyType_ = 0;

      speedLimit_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_ModifyTask_descriptor;
    }

    public cn.com.unary.initcopy.grpc.entity.ModifyTask getDefaultInstanceForType() {
      return cn.com.unary.initcopy.grpc.entity.ModifyTask.getDefaultInstance();
    }

    public cn.com.unary.initcopy.grpc.entity.ModifyTask build() {
      cn.com.unary.initcopy.grpc.entity.ModifyTask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.com.unary.initcopy.grpc.entity.ModifyTask buildPartial() {
      cn.com.unary.initcopy.grpc.entity.ModifyTask result = new cn.com.unary.initcopy.grpc.entity.ModifyTask(this);
      result.taskId_ = taskId_;
      result.modifyType_ = modifyType_;
      result.speedLimit_ = speedLimit_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.com.unary.initcopy.grpc.entity.ModifyTask) {
        return mergeFrom((cn.com.unary.initcopy.grpc.entity.ModifyTask)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.com.unary.initcopy.grpc.entity.ModifyTask other) {
      if (other == cn.com.unary.initcopy.grpc.entity.ModifyTask.getDefaultInstance()) return this;
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        onChanged();
      }
      if (other.modifyType_ != 0) {
        setModifyTypeValue(other.getModifyTypeValue());
      }
      if (other.getSpeedLimit() != 0) {
        setSpeedLimit(other.getSpeedLimit());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.com.unary.initcopy.grpc.entity.ModifyTask parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.com.unary.initcopy.grpc.entity.ModifyTask) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     *对应的任务id
     * </pre>
     *
     * <code>optional string taskId = 1;</code>
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *对应的任务id
     * </pre>
     *
     * <code>optional string taskId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *对应的任务id
     * </pre>
     *
     * <code>optional string taskId = 1;</code>
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *对应的任务id
     * </pre>
     *
     * <code>optional string taskId = 1;</code>
     */
    public Builder clearTaskId() {
      
      taskId_ = getDefaultInstance().getTaskId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *对应的任务id
     * </pre>
     *
     * <code>optional string taskId = 1;</code>
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskId_ = value;
      onChanged();
      return this;
    }

    private int modifyType_ = 0;
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
     */
    public int getModifyTypeValue() {
      return modifyType_;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
     */
    public Builder setModifyTypeValue(int value) {
      modifyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
     */
    public cn.com.unary.initcopy.grpc.constant.ModifyType getModifyType() {
      cn.com.unary.initcopy.grpc.constant.ModifyType result = cn.com.unary.initcopy.grpc.constant.ModifyType.valueOf(modifyType_);
      return result == null ? cn.com.unary.initcopy.grpc.constant.ModifyType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
     */
    public Builder setModifyType(cn.com.unary.initcopy.grpc.constant.ModifyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      modifyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.constant.ModifyType modifyType = 2;</code>
     */
    public Builder clearModifyType() {
      
      modifyType_ = 0;
      onChanged();
      return this;
    }

    private int speedLimit_ ;
    /**
     * <pre>
     *限速 以M为单位  0为不限速
     * </pre>
     *
     * <code>optional int32 speedLimit = 3;</code>
     */
    public int getSpeedLimit() {
      return speedLimit_;
    }
    /**
     * <pre>
     *限速 以M为单位  0为不限速
     * </pre>
     *
     * <code>optional int32 speedLimit = 3;</code>
     */
    public Builder setSpeedLimit(int value) {
      
      speedLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *限速 以M为单位  0为不限速
     * </pre>
     *
     * <code>optional int32 speedLimit = 3;</code>
     */
    public Builder clearSpeedLimit() {
      
      speedLimit_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:cn.com.unary.initcopy.grpc.entity.ModifyTask)
  }

  // @@protoc_insertion_point(class_scope:cn.com.unary.initcopy.grpc.entity.ModifyTask)
  private static final cn.com.unary.initcopy.grpc.entity.ModifyTask DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.com.unary.initcopy.grpc.entity.ModifyTask();
  }

  public static cn.com.unary.initcopy.grpc.entity.ModifyTask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyTask>
      PARSER = new com.google.protobuf.AbstractParser<ModifyTask>() {
    public ModifyTask parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ModifyTask(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyTask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyTask> getParserForType() {
    return PARSER;
  }

  public cn.com.unary.initcopy.grpc.entity.ModifyTask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

