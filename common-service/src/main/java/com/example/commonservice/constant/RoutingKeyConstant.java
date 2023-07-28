package com.example.commonservice.constant;

public class RoutingKeyConstant {
    private static final String SUB_NAME = "AnhDt"; //CHANGE WHEN DEV

    private RoutingKeyConstant() {
    }

    /**Module name*/
    private static final String HTTP_API = SUB_NAME + "httpApi.";
    private static final String CORE_SYSTEM = SUB_NAME + "coreSystem.";
    private static final String CORE_SMART_FARM = SUB_NAME + "coreSmartFarm.";
    private static final String SOUTHBOUND_ADAPTER = SUB_NAME + "southboundAdapter.";
    private static final String SOUTHBOUND_MQTT_CLIENT = SUB_NAME + "southboundMqttClient.";
    private static final String VOD = SUB_NAME + "vod.";
    private static final String CORE_LOG = SUB_NAME + "coreLog.";
    private static final String REPORT_SERVICE = SUB_NAME + "reportService.";
    private static final String WEBHOOK_SERVICE = SUB_NAME + "webhook.";

    /**Pattern for routing key*/
    private static final String REQUEST = "request.";
    private static final String RESPONSE = "response.";

    /**Root routing key for request*/
    public static final String ROUTING_KEY_REQUEST_HTTP_API = HTTP_API + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_CORE_SYSTEM = CORE_SYSTEM + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_CORE_SMART_FARM = CORE_SMART_FARM + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_SOUTHBOUND_ADAPTER = SOUTHBOUND_ADAPTER + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_CORE_LOG = CORE_LOG + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_SOUTHBOUND_MQTT_CLIENT = SOUTHBOUND_MQTT_CLIENT + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_REPORT_SERVICE = REPORT_SERVICE + REQUEST + "#";
    public static final String ROUTING_KEY_REQUEST_WEBHOOK = WEBHOOK_SERVICE + REQUEST + "#";

    /**Routing Key for response*/
    public static final String ROUTING_KEY_RESPONSE_HTTP_API = HTTP_API + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_WEBHOOK = WEBHOOK_SERVICE + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_CORE_SYSTEM = CORE_SYSTEM + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_CORE_SMART_FARM = CORE_SMART_FARM + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_SOUTHBOUND_ADAPTER = SOUTHBOUND_ADAPTER + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_CORE_LOG = CORE_LOG + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_SOUTHBOUND_MQTT_CLIENT = SOUTHBOUND_MQTT_CLIENT + RESPONSE + "#";
    public static final String ROUTING_KEY_RESPONSE_REPORT_SERVICE = REPORT_SERVICE + RESPONSE + "#";

    /** Routing Key for request module SOUTHBOUND ADAPTER*/
    public static final String ROUTING_KEY_MQTT = SOUTHBOUND_ADAPTER + REQUEST + "Mqtt";
    public static final String ROUTING_KEY_AFTER_CREATE_DEVICE = SOUTHBOUND_ADAPTER + REQUEST + "AfterCreateDevice";
    public static final String ROUTING_KEY_SBA_CONFIG = SOUTHBOUND_ADAPTER + REQUEST + "SbaConfig";


    /** Routing Key for request module CORE SYSTEM*/
    public static final String ROUTING_KEY_USER = CORE_SYSTEM + REQUEST + "User";
    public static final String ROUTING_KEY_AUTH = CORE_SYSTEM + REQUEST + "Auth";
    public static final String ROUTING_KEY_ROLE = CORE_SYSTEM + REQUEST + "Role";
    public static final String ROUTING_KEY_PRIVILEGE = CORE_SYSTEM + REQUEST + "Privilege";
    public static final String ROUTING_KEY_COUNTRY = CORE_SYSTEM + REQUEST + "Country";
    public static final String ROUTING_KEY_TENANT = CORE_SYSTEM + REQUEST + "Tenant";
    public static final String ROUTING_KEY_APPLICATION = CORE_SYSTEM + REQUEST + "Application";
    public static final String ROUTING_KEY_NOTIFICATION = CORE_SYSTEM + REQUEST + "Notification";
    public static final String ROUTING_KEY_HOME = CORE_SYSTEM + REQUEST + "Home";
    public static final String ROUTING_KEY_ROOM = CORE_SYSTEM + REQUEST + "Room";
    public static final String ROUTING_KEY_DEVICE = CORE_SYSTEM + REQUEST + "Device";
    public static final String ROUTING_KEY_DEVICE_TYPE = CORE_SYSTEM + REQUEST + "DeviceType";
    public static final String ROUTING_KEY_DEVICE_MODEL = CORE_SYSTEM + REQUEST + "DeviceModel";
    public static final String ROUTING_KEY_PROVIDER = CORE_SYSTEM + REQUEST + "Provider";
    public static final String ROUTING_KEY_FIRMWARE = CORE_SYSTEM + REQUEST + "Firmware";
    public static final String ROUTING_KEY_ALARM = CORE_SYSTEM + REQUEST + "Alarm";
    public static final String ROUTING_KEY_TIMEZONE = CORE_SYSTEM + REQUEST + "TimeZone";
    public static final String ROUTING_KEY_POLICY =CORE_SYSTEM + REQUEST+ "Policy";
    public static final String ROUTING_KEY_LOG =CORE_SYSTEM + REQUEST+ "Log";
    public static final String ROUTING_KEY_LOG_TYPE =CORE_SYSTEM + REQUEST+ "LogType";
    public static final String ROUTING_KEY_VIRTUAL_DEVICE = CORE_SYSTEM + REQUEST+ "VirtualDevice";
    public static final String ROUTING_KEY_USER_HOME = CORE_SYSTEM + REQUEST+ "UserHome";
    public static final String ROUTING_KEY_GROUP_DEVICE_LIGHTING = CORE_SYSTEM + REQUEST + "GroupDevice";
    public static final String ROUTING_KEY_SCENE_LIGHTING = CORE_SYSTEM + REQUEST + "SceneLighting";
    public static final String ROUTING_KEY_THIRD_PARTY =CORE_SYSTEM + REQUEST+ "ThirdParty";
    public static final String ROUTING_KEY_USER_MEMBER = CORE_SYSTEM + REQUEST + "UserMember";
    public static final String ROUTING_KEY_NOTIFICATION_MANAGER = CORE_SYSTEM + REQUEST + "NotificationManager";
    public static final String ROUTING_KEY_MOBILE_VERSION_MANAGER = CORE_SYSTEM + REQUEST + "MobileVersionManager";
    public static final String ROUTING_KEY_UID_MANAGEMENT = CORE_SYSTEM + REQUEST + "UidManagement";
    public static final String ROUTING_KEY_FAQ_MANAGER = CORE_SYSTEM + REQUEST + "FaqManager";
    public static final String ROUTING_KEY_PARTNER_ACCOUNT_LINKING = CORE_SYSTEM + REQUEST+ "AccountLinking";
    /** Routing Key for request module CORE PAYMENT*/
    public static final String ROUTING_KEY_SERVICE_PACKAGE = CORE_SYSTEM + REQUEST + "ServicePackage";
    public static final String ROUTING_KEY_SERVICE_PAYMENT = CORE_SYSTEM + REQUEST + "ServicePayment";
    public static final String ROUTING_KEY_SERVICE_DEVICE = CORE_SYSTEM + REQUEST + "ServiceDevice";
    public static final String ROUTING_KEY_SERVICE_BILL = CORE_SYSTEM + REQUEST + "ServiceBill";
    public static final String ROUTING_KEY_IR_TEMPLATE = CORE_SYSTEM + REQUEST + "IrTemplate";
    public static final String ROUTING_KEY_IR_BRAND = CORE_SYSTEM + REQUEST + "IrBrand";
    public static final String ROUTING_KEY_IR_CATEGORY = CORE_SYSTEM + REQUEST + "IrCategory";
    public static final String ROUTING_KEY_IR_QUICK_MATCHING_TEMPLATE = CORE_SYSTEM + REQUEST + "IrQuickMatchingTemplate";

    /** Routing key for api dshsxkd */
    public static final String ROUTING_KEY_DHSXKD = CORE_SYSTEM + REQUEST + "DHSXKDApi";

    /**
     * Routing key for landing page create contact
     */
    public static final String ROUTING_KEY_CONTACT = CORE_SYSTEM + REQUEST + "Contact";

    /** Routing Key for request module CORE SMART FARM*/
    public static final String ROUTING_KEY_AUTOMATIC_CONTROL = CORE_SMART_FARM + REQUEST + "AutomaticControl";
    public static final String ROUTING_KEY_GROUP_DEVICE = CORE_SMART_FARM + REQUEST + "GroupDevice";
    public static final String ROUTING_KEY_AUTOMATIC_SCHEDULE = CORE_SMART_FARM + REQUEST + "AutomaticSchedule";
    public static final String ROUTING_KEY_PRODUCT = CORE_SMART_FARM + REQUEST + "Product";
    public static final String ROUTING_KEY_PRODUCT_CATEGORY = CORE_SMART_FARM + REQUEST + "ProductCategory";
    public static final String ROUTING_KEY_UOMTYPE = CORE_SMART_FARM + REQUEST + "UomType";
    public static final String ROUTING_KEY_UOM= CORE_SMART_FARM + REQUEST + "Uom";
    public static final String ROUTING_KEY_PHASE = CORE_SMART_FARM + REQUEST + "Phase";
    public static final String ROUTING_KEY_SEASON = CORE_SMART_FARM + REQUEST + "Season";
    public static final String ROUTING_KEY_PROCEDURE_LOG = CORE_SMART_FARM + REQUEST + "ProcedureLog";
    public static final String ROUTING_KEY_ALARM_CONFIG = CORE_SMART_FARM + REQUEST + "AlarmConfig";
    public static final String ROUTING_KEY_LISTEN_MQTT = CORE_SMART_FARM + REQUEST + "ListenMqtt";
    public static final String ROUTING_KEY_FILE = CORE_SMART_FARM + REQUEST + "File";
    public static final String ROUTING_KEY_SECTOR = CORE_SMART_FARM + REQUEST + "Sector";
    public static final String ROUTING_KEY_ATTACHMENT = CORE_SMART_FARM + REQUEST + "Attachment";
    public static final String ROUTING_KEY_QRCODE = CORE_SMART_FARM + REQUEST + "QRCode";

    /** VOD */
    public static final String ROUTING_KEY_METADATA = VOD + REQUEST + "Metadata";
    public static final String ROUTING_KEY_RESOURCE = VOD + REQUEST + "Resource";
    public static final String ROUTING_KEY_VOD_LOG = CORE_SYSTEM + REQUEST + "VodLog";
    public static final String ROUTING_KEY_CONFIG = CORE_SYSTEM + REQUEST + "Config";

    /** Routing Key for request module Area*/
    public static final String ROUTING_KEY_AREA = CORE_SYSTEM + REQUEST + "Area";
    public static final String ROUTING_KEY_DEVICE_IMPORT = CORE_SYSTEM + REQUEST + "DeviceImport";
    public static final String ROUTING_KEY_FILE_IMPORT = CORE_SYSTEM + REQUEST + "FileImport";

    /** Routing Key for request module Comment*/
    public static final String ROUTING_KEY_COMMENT = CORE_SYSTEM + REQUEST + "Comment";

    /** Routing Key for request module Customer*/
    public static final String ROUTING_KEY_CUSTOMER = CORE_SYSTEM + REQUEST + "Customer";
    public static final String ROUTING_KEY_RULE = CORE_SYSTEM + REQUEST + "Rule";

    public static final String ROUTING_KEY_REQUEST_VOD_SERVICE = VOD + REQUEST + "#";
    public static final String ROUTING_KEY_RESPONSE_VOD_SERVICE = VOD + RESPONSE + "#";
    public static final String ROUTING_KEY_CORE_LOG = CORE_LOG + REQUEST + "CoreLog";
    public static final String ROUTING_KEY_GRAPH = CORE_LOG + REQUEST + "Graph";

    /** Routing Key for request module Telemetry*/
    public static final String ROUTING_KEY_CORE_TELEMETRY_LOG= CORE_LOG + REQUEST + "TelemetryLog";

    /** Routing Key for Mqtt Event module Southbound-Adapter*/
    public static final String ROUTING_KEY_MQTT_TELEMETRY = SOUTHBOUND_ADAPTER + "telemetryEvent";
    public static final String ROUTING_KEY_MQTT_COMMAND = SOUTHBOUND_ADAPTER + "commandEvent";
    public static final String ROUTING_KEY_MQTT_STATUS = SOUTHBOUND_ADAPTER + "statusEvent";

    /** Routing Key for Mqtt Event module Southbound-Mqtt-Client*/
    public static final String ROUTING_KEY_SB_MQTT_CLIENT_CONFIG = SOUTHBOUND_MQTT_CLIENT + REQUEST + "sbConfig";

    /** Routing Key for request module Report Service*/
    public static final String ROUTING_KEY_CUSTOMER_REPORT = REPORT_SERVICE + REQUEST+ "CustomerReport";
    public static final String ROUTING_KEY_DEVICE_REPORT = REPORT_SERVICE + REQUEST+ "DeviceReport";
    public static final String ROUTING_KEY_PERIODICALLY_REPORT = REPORT_SERVICE + REQUEST+ "Periodically";
    public static final String ROUTING_KEY_SUBSCRIPTION_REPORT = REPORT_SERVICE + REQUEST + "SubscriptionReport";
    public static final String ROUTING_KEY_REVENUE_REPORT = REPORT_SERVICE + REQUEST + "RevenueReport";
    public static final String ROUTING_KEY_TRANSACTION_REPORT = REPORT_SERVICE + REQUEST + "TransactionReport";
    public static final String ROUTING_KEY_CLOUD_PARTNER_REQUEST = WEBHOOK_SERVICE + REQUEST + "CloudPartner";

    /** Routing Key for request module remote Service*/
    public static final String ROUTING_KEY_REMOTE= CORE_SYSTEM + REQUEST + "Remote";
    public static final String ROUTING_KEY_PRIVATE_LIB= CORE_SYSTEM + REQUEST + "PrivateLib";

    /** Routing Key for request Southbound for learn Ir*/
    public static final String ROUTING_KEY_LEARN = SOUTHBOUND_ADAPTER + REQUEST + "Learn";

    /** Routing Key for request Southbound for control Ir*/
    public static final String ROUTING_KEY_CONTROL = SOUTHBOUND_ADAPTER + REQUEST + "Control";
}
