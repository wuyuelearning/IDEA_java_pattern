package test;

/**
 * Created by wuyue on 2018/10/19.
 */
public class TestEnum {
    public static void main(String[] args) {

//
//        System.out.println("TYPE.JAVA: "+TYPE.JAVA);
//        System.out.println("TYPE.TYPE.JAVA.name(): "+TYPE.JAVA.name());
//        System.out.println("TYPE.TYPE.JAVA.name: "+TYPE.JAVA.name);
//        System.out.println("TYPE.TYPE.JAVA.getName(): "+TYPE.JAVA.getName());
//        System.out.println("TYPE.TYPE.getName(\"JAVA\"): "+TYPE.getName("JAVA"));


//        System.out.println(INVOICE_STATUS_CODE_ENUM.UNPAY);
//        System.out.println(INVOICE_STATUS_CODE_ENUM.UNPAY.getInvoiceStatusCode());
//        System.out.println(INVOICE_STATUS_CODE_ENUM.UNPAY.getInvoiceStatusDesc());
//        System.out.println(INVOICE_STATUS_CODE_ENUM.UNPAY.getInvoiceStatusName());
//        System.out.println(INVOICE_STATUS_CODE_ENUM.UNPAY.name());

        System.out.println(INVOICE_TYPE_ENUM.NO_NEED.getInvoiceTypeCode());


    }


    /**
     * Created by wuyue on 2018/10/31.
     * describe: 发票状态
     * 状态名称(invoiceStatusName) 状态码(invoiceStatusCode)  状态描述(invoiceStatusDesc) 对应枚举
     */
    public enum INVOICE_STATUS_CODE_ENUM {

        UNPAY("UNPAY22", "1", "运费¥10"),
        CANCEL("CANCEL", "2", "已取消"),
        UNBILL("UNBILL", "3", "已申请,待审核"),
        APPROVE("APPROVE", "4", "已经审核"),
        BILLED("BILLED", "5", "已经开票（普通发票 为 开具发票）"),
        INVALID("INVALID", "6", "已作废"),
        COMPLETE("COMPLETE", "7", "已完成（普通发票 为 已寄出）"),
        UNUSABLE("UNUSABLE", "8", "发票无效"),
        FAILURE("FAILURE", "9", "申请失败"),
        COMMIT("COMMIT", "10", "已提交");


        private String invoiceStatusName;  //状态名称
        private String invoiceStatusCode;  //状态码
        private String invoiceStatusDesc;  //状态描述

        INVOICE_STATUS_CODE_ENUM(String invoiceStatusName, String invoiceStatusCode, String invoiceStatusDesc) {
            this.invoiceStatusName = invoiceStatusName;
            this.invoiceStatusCode = invoiceStatusCode;
            this.invoiceStatusDesc = invoiceStatusDesc;
        }


        public String getInvoiceStatusName() {
            return invoiceStatusName;
        }

        public String getInvoiceStatusCode() {
            return invoiceStatusCode;
        }

        public String getInvoiceStatusDesc() {
            return invoiceStatusDesc;
        }

    }

    /**
     * 发票类型  （0-无发票，1-普通发票，2-电子发票,3-其它发票）
     * <p>
     * 类型码（invoiceTypeCode） 类型描述（InvoiceTypeDec）
     */

    public enum INVOICE_TYPE_ENUM {

        NO_NEED("0", "无发票"),
        PAPER_INVOICE("1", "普通发票"),
        ELECTRONIC_INVOICE("2", "电子发票"),
        OTHER_INVOICE("3", "其他发票");

        private String invoiceTypeCode; // 类型码
        private String invoiceTypeDec; // 类型描述

        INVOICE_TYPE_ENUM(String invoiceTypeCode, String invoiceTypeDec) {

            this.invoiceTypeCode = invoiceTypeCode;
            this.invoiceTypeDec = invoiceTypeDec;
        }

        public String getInvoiceTypeCode() {
            return invoiceTypeCode;
        }

        public String getInvoiceTypeDec() {
            return invoiceTypeDec;
        }
    }

    /**
     * 发票展示状态控制
     * 控制发票列表中，发票Item的展示内容
     */

    public enum INVOICE_OPERATOR_STRATEGY_ENUM {
        NO_SHOW("0", "不展示"),
        CANCAL("1", "取消申请,修改发票"),
        REAPPLY("2", "重新申请"),
        CHECK_E_INVOICE("3", "查看电子发票详情"),
        PAY_FREIGHT("4", "支付运费");

        private String invoiceOperatorCode; //  发票展示码
        private String invoiceOperatorCodeDec; //  发票展示码

        INVOICE_OPERATOR_STRATEGY_ENUM(String invoiceOperatorCode, String invoiceOperatorCodeDec) {
            this.invoiceOperatorCode = invoiceOperatorCode;
            this.invoiceOperatorCodeDec = invoiceOperatorCodeDec;

        }

        public String getInvoiceOperatorCode() {
            return invoiceOperatorCode;
        }

        public String getInvoiceOperatorCodeDec() {
            return invoiceOperatorCodeDec;
        }
    }

    /**
     * 发票抬头类型
     * （0 -- 企业,1 -- 政府事业单位,2 --个人）
     */

    public enum INVOICE_TITLE_TYPE_ENUM {
        ENTERPRISE("0", "企业"),
        GOVERNMENT("1", "政府"),
        INDIVIDUAL("2", "个人");
        private String invoiceTitleType;
        private String invoiceTitleTypeDec;

        INVOICE_TITLE_TYPE_ENUM(String titleType, String dec) {
            this.invoiceTitleType = titleType;
            this.invoiceTitleTypeDec = dec;
        }

        public String getInvoiceTitleType() {
            return invoiceTitleType;
        }

        public String getInvoiceTitleTypeDec() {
            return invoiceTitleTypeDec;
        }
    }

    public enum TYPE {

        C("c"), JAVA("java"), RUBY("ruby"), PHYTHON("phython");

        private String name;

        TYPE(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static String getName(String name) {
            for (TYPE type : TYPE.values()) {
                if (type.name.equals(name)) {
                    return type.getName();
                }
            }
            return name;
        }
    }

}
