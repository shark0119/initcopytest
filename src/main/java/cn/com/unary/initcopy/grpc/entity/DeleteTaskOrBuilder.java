// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: init_copy_entity.proto

package cn.com.unary.initcopy.grpc.entity;

public interface DeleteTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.com.unary.initcopy.grpc.entity.DeleteTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string taskId = 1;</code>
   */
  java.lang.String getTaskId();
  /**
   * <code>optional string taskId = 1;</code>
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   *目标端是否删除备份的文件
   * </pre>
   *
   * <code>optional bool deleteFile = 2;</code>
   */
  boolean getDeleteFile();
}