package tech.kotlin.model.request

import com.baidu.bjf.remoting.protobuf.FieldType
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf
import com.fasterxml.jackson.annotation.JsonProperty

class QueryArticleInOrderReq {

    @com.baidu.bjf.remoting.protobuf.annotation.Protobuf(order = 1, required = true, fieldType = com.baidu.bjf.remoting.protobuf.FieldType.UINT32, description = "排序方式")
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    var order: Int = tech.kotlin.model.request.QueryArticleInOrderReq.Order.DATE_DESC

    @com.baidu.bjf.remoting.protobuf.annotation.Protobuf(order = 2, required = false, fieldType = com.baidu.bjf.remoting.protobuf.FieldType.UINT64, description = "查询uid")
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    var uid: Long = 0

    @com.baidu.bjf.remoting.protobuf.annotation.Protobuf(order = 3, required = false, fieldType = com.baidu.bjf.remoting.protobuf.FieldType.STRING, description = "查询tags")
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    var tags: String = ""

    @com.baidu.bjf.remoting.protobuf.annotation.Protobuf(order = 4, required = true, fieldType = com.baidu.bjf.remoting.protobuf.FieldType.UINT32, description = "查询偏移值")
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    var offset: Int = 0

    object Order {
        const val DATE_DESC = 0
    }
}