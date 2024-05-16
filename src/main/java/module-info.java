module com.qcrrm.mybatissqlitedemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mybatis;
    requires org.xerial.sqlitejdbc;

    opens com.qcrrm.mybatissqlitedemo to javafx.fxml;
    exports com.qcrrm.mybatissqlitedemo;
    exports com.qcrrm.mybatissqlitedemo.util;
    opens com.qcrrm.mybatissqlitedemo.util to javafx.fxml;

    opens com.qcrrm.mybatissqlitedemo.pojo to org.mybatis;
}