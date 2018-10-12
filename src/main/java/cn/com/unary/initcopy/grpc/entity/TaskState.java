// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: init_copy_entity.proto

package cn.com.unary.initcopy.grpc.entity;

/**
 * <pre>
 * 任务状态
 * </pre>
 *
 * Protobuf type {@code cn.com.unary.initcopy.grpc.entity.TaskState}
 */
public  final class TaskState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.com.unary.initcopy.grpc.entity.TaskState)
    TaskStateOrBuilder {
  // Use TaskState.newBuilder() to construct.
  private TaskState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskState() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TaskState(
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
          case 18: {
            cn.com.unary.initcopy.grpc.entity.ExecResult.Builder subBuilder = null;
            if (execResult_ != null) {
              subBuilder = execResult_.toBuilder();
            }
            execResult_ = input.readMessage(cn.com.unary.initcopy.grpc.entity.ExecResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(execResult_);
              execResult_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder subBuilder = null;
            if (progressInfo_ != null) {
              subBuilder = progressInfo_.toBuilder();
            }
            progressInfo_ = input.readMessage(cn.com.unary.initcopy.grpc.entity.ProgressInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(progressInfo_);
              progressInfo_ = subBuilder.buildPartial();
            }

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
    return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_TaskState_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_TaskState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.com.unary.initcopy.grpc.entity.TaskState.class, cn.com.unary.initcopy.grpc.entity.TaskState.Builder.class);
  }

  public static final int EXECRESULT_FIELD_NUMBER = 2;
  private cn.com.unary.initcopy.grpc.entity.ExecResult execResult_;
  /**
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
   */
  public boolean hasExecResult() {
    return execResult_ != null;
  }
  /**
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
   */
  public cn.com.unary.initcopy.grpc.entity.ExecResult getExecResult() {
    return execResult_ == null ? cn.com.unary.initcopy.grpc.entity.ExecResult.getDefaultInstance() : execResult_;
  }
  /**
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
   */
  public cn.com.unary.initcopy.grpc.entity.ExecResultOrBuilder getExecResultOrBuilder() {
    return getExecResult();
  }

  public static final int PROGRESSINFO_FIELD_NUMBER = 3;
  private cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo_;
  /**
   * <pre>
   *进度信息
   * </pre>
   *
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
   */
  public boolean hasProgressInfo() {
    return progressInfo_ != null;
  }
  /**
   * <pre>
   *进度信息
   * </pre>
   *
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
   */
  public cn.com.unary.initcopy.grpc.entity.ProgressInfo getProgressInfo() {
    return progressInfo_ == null ? cn.com.unary.initcopy.grpc.entity.ProgressInfo.getDefaultInstance() : progressInfo_;
  }
  /**
   * <pre>
   *进度信息
   * </pre>
   *
   * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
   */
  public cn.com.unary.initcopy.grpc.entity.ProgressInfoOrBuilder getProgressInfoOrBuilder() {
    return getProgressInfo();
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
    if (execResult_ != null) {
      output.writeMessage(2, getExecResult());
    }
    if (progressInfo_ != null) {
      output.writeMessage(3, getProgressInfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (execResult_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExecResult());
    }
    if (progressInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProgressInfo());
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
    if (!(obj instanceof cn.com.unary.initcopy.grpc.entity.TaskState)) {
      return super.equals(obj);
    }
    cn.com.unary.initcopy.grpc.entity.TaskState other = (cn.com.unary.initcopy.grpc.entity.TaskState) obj;

    boolean result = true;
    result = result && (hasExecResult() == other.hasExecResult());
    if (hasExecResult()) {
      result = result && getExecResult()
          .equals(other.getExecResult());
    }
    result = result && (hasProgressInfo() == other.hasProgressInfo());
    if (hasProgressInfo()) {
      result = result && getProgressInfo()
          .equals(other.getProgressInfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasExecResult()) {
      hash = (37 * hash) + EXECRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getExecResult().hashCode();
    }
    if (hasProgressInfo()) {
      hash = (37 * hash) + PROGRESSINFO_FIELD_NUMBER;
      hash = (53 * hash) + getProgressInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.com.unary.initcopy.grpc.entity.TaskState parseFrom(
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
  public static Builder newBuilder(cn.com.unary.initcopy.grpc.entity.TaskState prototype) {
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
   * 任务状态
   * </pre>
   *
   * Protobuf type {@code cn.com.unary.initcopy.grpc.entity.TaskState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.com.unary.initcopy.grpc.entity.TaskState)
      cn.com.unary.initcopy.grpc.entity.TaskStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_TaskState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_TaskState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.com.unary.initcopy.grpc.entity.TaskState.class, cn.com.unary.initcopy.grpc.entity.TaskState.Builder.class);
    }

    // Construct using cn.com.unary.initcopy.grpc.entity.TaskState.newBuilder()
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
      if (execResultBuilder_ == null) {
        execResult_ = null;
      } else {
        execResult_ = null;
        execResultBuilder_ = null;
      }
      if (progressInfoBuilder_ == null) {
        progressInfo_ = null;
      } else {
        progressInfo_ = null;
        progressInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.com.unary.initcopy.grpc.entity.IC_Entity.internal_static_cn_com_unary_initcopy_grpc_entity_TaskState_descriptor;
    }

    public cn.com.unary.initcopy.grpc.entity.TaskState getDefaultInstanceForType() {
      return cn.com.unary.initcopy.grpc.entity.TaskState.getDefaultInstance();
    }

    public cn.com.unary.initcopy.grpc.entity.TaskState build() {
      cn.com.unary.initcopy.grpc.entity.TaskState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.com.unary.initcopy.grpc.entity.TaskState buildPartial() {
      cn.com.unary.initcopy.grpc.entity.TaskState result = new cn.com.unary.initcopy.grpc.entity.TaskState(this);
      if (execResultBuilder_ == null) {
        result.execResult_ = execResult_;
      } else {
        result.execResult_ = execResultBuilder_.build();
      }
      if (progressInfoBuilder_ == null) {
        result.progressInfo_ = progressInfo_;
      } else {
        result.progressInfo_ = progressInfoBuilder_.build();
      }
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
      if (other instanceof cn.com.unary.initcopy.grpc.entity.TaskState) {
        return mergeFrom((cn.com.unary.initcopy.grpc.entity.TaskState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.com.unary.initcopy.grpc.entity.TaskState other) {
      if (other == cn.com.unary.initcopy.grpc.entity.TaskState.getDefaultInstance()) return this;
      if (other.hasExecResult()) {
        mergeExecResult(other.getExecResult());
      }
      if (other.hasProgressInfo()) {
        mergeProgressInfo(other.getProgressInfo());
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
      cn.com.unary.initcopy.grpc.entity.TaskState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.com.unary.initcopy.grpc.entity.TaskState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cn.com.unary.initcopy.grpc.entity.ExecResult execResult_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.com.unary.initcopy.grpc.entity.ExecResult, cn.com.unary.initcopy.grpc.entity.ExecResult.Builder, cn.com.unary.initcopy.grpc.entity.ExecResultOrBuilder> execResultBuilder_;
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public boolean hasExecResult() {
      return execResultBuilder_ != null || execResult_ != null;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ExecResult getExecResult() {
      if (execResultBuilder_ == null) {
        return execResult_ == null ? cn.com.unary.initcopy.grpc.entity.ExecResult.getDefaultInstance() : execResult_;
      } else {
        return execResultBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public Builder setExecResult(cn.com.unary.initcopy.grpc.entity.ExecResult value) {
      if (execResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        execResult_ = value;
        onChanged();
      } else {
        execResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public Builder setExecResult(
        cn.com.unary.initcopy.grpc.entity.ExecResult.Builder builderForValue) {
      if (execResultBuilder_ == null) {
        execResult_ = builderForValue.build();
        onChanged();
      } else {
        execResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public Builder mergeExecResult(cn.com.unary.initcopy.grpc.entity.ExecResult value) {
      if (execResultBuilder_ == null) {
        if (execResult_ != null) {
          execResult_ =
            cn.com.unary.initcopy.grpc.entity.ExecResult.newBuilder(execResult_).mergeFrom(value).buildPartial();
        } else {
          execResult_ = value;
        }
        onChanged();
      } else {
        execResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public Builder clearExecResult() {
      if (execResultBuilder_ == null) {
        execResult_ = null;
        onChanged();
      } else {
        execResult_ = null;
        execResultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ExecResult.Builder getExecResultBuilder() {
      
      onChanged();
      return getExecResultFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ExecResultOrBuilder getExecResultOrBuilder() {
      if (execResultBuilder_ != null) {
        return execResultBuilder_.getMessageOrBuilder();
      } else {
        return execResult_ == null ?
            cn.com.unary.initcopy.grpc.entity.ExecResult.getDefaultInstance() : execResult_;
      }
    }
    /**
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ExecResult execResult = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.com.unary.initcopy.grpc.entity.ExecResult, cn.com.unary.initcopy.grpc.entity.ExecResult.Builder, cn.com.unary.initcopy.grpc.entity.ExecResultOrBuilder> 
        getExecResultFieldBuilder() {
      if (execResultBuilder_ == null) {
        execResultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.com.unary.initcopy.grpc.entity.ExecResult, cn.com.unary.initcopy.grpc.entity.ExecResult.Builder, cn.com.unary.initcopy.grpc.entity.ExecResultOrBuilder>(
                getExecResult(),
                getParentForChildren(),
                isClean());
        execResult_ = null;
      }
      return execResultBuilder_;
    }

    private cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.com.unary.initcopy.grpc.entity.ProgressInfo, cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder, cn.com.unary.initcopy.grpc.entity.ProgressInfoOrBuilder> progressInfoBuilder_;
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public boolean hasProgressInfo() {
      return progressInfoBuilder_ != null || progressInfo_ != null;
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ProgressInfo getProgressInfo() {
      if (progressInfoBuilder_ == null) {
        return progressInfo_ == null ? cn.com.unary.initcopy.grpc.entity.ProgressInfo.getDefaultInstance() : progressInfo_;
      } else {
        return progressInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public Builder setProgressInfo(cn.com.unary.initcopy.grpc.entity.ProgressInfo value) {
      if (progressInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        progressInfo_ = value;
        onChanged();
      } else {
        progressInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public Builder setProgressInfo(
        cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder builderForValue) {
      if (progressInfoBuilder_ == null) {
        progressInfo_ = builderForValue.build();
        onChanged();
      } else {
        progressInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public Builder mergeProgressInfo(cn.com.unary.initcopy.grpc.entity.ProgressInfo value) {
      if (progressInfoBuilder_ == null) {
        if (progressInfo_ != null) {
          progressInfo_ =
            cn.com.unary.initcopy.grpc.entity.ProgressInfo.newBuilder(progressInfo_).mergeFrom(value).buildPartial();
        } else {
          progressInfo_ = value;
        }
        onChanged();
      } else {
        progressInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public Builder clearProgressInfo() {
      if (progressInfoBuilder_ == null) {
        progressInfo_ = null;
        onChanged();
      } else {
        progressInfo_ = null;
        progressInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder getProgressInfoBuilder() {
      
      onChanged();
      return getProgressInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    public cn.com.unary.initcopy.grpc.entity.ProgressInfoOrBuilder getProgressInfoOrBuilder() {
      if (progressInfoBuilder_ != null) {
        return progressInfoBuilder_.getMessageOrBuilder();
      } else {
        return progressInfo_ == null ?
            cn.com.unary.initcopy.grpc.entity.ProgressInfo.getDefaultInstance() : progressInfo_;
      }
    }
    /**
     * <pre>
     *进度信息
     * </pre>
     *
     * <code>optional .cn.com.unary.initcopy.grpc.entity.ProgressInfo progressInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.com.unary.initcopy.grpc.entity.ProgressInfo, cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder, cn.com.unary.initcopy.grpc.entity.ProgressInfoOrBuilder> 
        getProgressInfoFieldBuilder() {
      if (progressInfoBuilder_ == null) {
        progressInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.com.unary.initcopy.grpc.entity.ProgressInfo, cn.com.unary.initcopy.grpc.entity.ProgressInfo.Builder, cn.com.unary.initcopy.grpc.entity.ProgressInfoOrBuilder>(
                getProgressInfo(),
                getParentForChildren(),
                isClean());
        progressInfo_ = null;
      }
      return progressInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:cn.com.unary.initcopy.grpc.entity.TaskState)
  }

  // @@protoc_insertion_point(class_scope:cn.com.unary.initcopy.grpc.entity.TaskState)
  private static final cn.com.unary.initcopy.grpc.entity.TaskState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.com.unary.initcopy.grpc.entity.TaskState();
  }

  public static cn.com.unary.initcopy.grpc.entity.TaskState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskState>
      PARSER = new com.google.protobuf.AbstractParser<TaskState>() {
    public TaskState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskState> getParserForType() {
    return PARSER;
  }

  public cn.com.unary.initcopy.grpc.entity.TaskState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
