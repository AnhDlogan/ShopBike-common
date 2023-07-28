package com.example.commonservice.constant;

public class QueueConstant {
    private static final String SUB_NAME = "AnhDt"; // CHANGE WHEN DEV

    private QueueConstant(){}

    /** Timeout waiting for reply asynchronous request (milliseconds) */
    public static final int TIME_OUT_ASYNCHRONOUS_REQUEST = 30000;

    /**Topic exchange*/
    public static final String TOPIC_EXCHANGE_NAME_DEFAULT = "vn.vnpt.stc.enterprise.event";
    public static final String TOPIC_EXCHANGE_REQUEST = "vn.vnpt.stc.enterprise.event.request";
    public static final String TOPIC_EXCHANGE_RESPONSE = "vn.vnpt.stc.enterprise.event.response";
    public static final String TOPIC_EXCHANGE_GATEWAY = "vn.vnpt.stc.enterprise.event.gateway";
    public static final String TOPIC_EXCHANGE_WEBHOOK = "vn.vnpt.stc.enterprise.event.webhook";

    /**List queue to used*/
    public static final String QUEUE_REQUEST_GATEWAY = "request-gateway" + SUB_NAME;
    public static final String QUEUE_RESPONSE_GATEWAY = "response-gateway" + SUB_NAME;
    public static final String QUEUE_RESPONSE_WEBHOOK = "response-webhook" +SUB_NAME;

    public static final String QUEUE_REQUEST_CORE_SYSTEM = "request-core-system" + SUB_NAME;
    public static final String QUEUE_RESPONSE_CORE_SYSTEM = "response-core-system" + SUB_NAME;

    public static final String QUEUE_REQUEST_CORE_PAYMENT = "request-core-payment" + SUB_NAME;
    public static final String QUEUE_REQUEST_WEBHOOK = "request-webhook" + SUB_NAME;
    public static final String QUEUE_RESPONSE_CORE_PAYMENT = "response-core-payment" + SUB_NAME;

    public static final String QUEUE_REQUEST_CORE_SMART_FARM = "request-core-smart-farm" + SUB_NAME;
    public static final String QUEUE_RESPONSE_CORE_SMART_FARM = "response-core-smart-farm" + SUB_NAME;

    public static final String QUEUE_REQUEST_SOUTHBOUND_ADAPTER = "request-southbound-adapter" + SUB_NAME;
    public static final String QUEUE_RESPONSE_SOUTHBOUND_ADAPTER = "response-southbound-adapter" + SUB_NAME;

    public static final String QUEUE_REQUEST_SOUTHBOUND_MQTT_CLIENT = "request-southbound-mqtt-client" + SUB_NAME;
    public static final String QUEUE_RESPONSE_SOUTHBOUND_MQTT_CLIENT = "response-southbound-mqtt-client" + SUB_NAME;

    public static final String QUEUE_REQUEST_VOD_SERVICE = "request-vod-service" + SUB_NAME;
    public static final String QUEUE_RESPONSE_VOD_SERVICE = "response-vod-service" + SUB_NAME;

    public static final String QUEUE_REQUEST_CORE_LOG = "request-core-log" + SUB_NAME;
    public static final String QUEUE_RESPONSE_CORE_LOG = "response-core-log" + SUB_NAME;

    public static final String QUEUE_MQTT_TELEMETRY = "queue-mqtt-telemetry" + SUB_NAME;
    public static final String QUEUE_MQTT_COMMAND = "queue-mqtt-command" + SUB_NAME;
    public static final String QUEUE_MQTT_STATUS = "queue-mqtt-status" + SUB_NAME;

    public static final String QUEUE_REQUEST_REPORT_SERVICE = "request-report-service" + SUB_NAME;
    public static final String QUEUE_RESPONSE_REPORT_SERVICE = "response-report-service" + SUB_NAME;

    /**Result status of send Event*/
    public static final class ResultStatus {
        private ResultStatus(){}

        public static final int TIME_OUT = -1;
        public static final int SUCCESS = 0;
        public static final int ERROR = 1;
    }
}
