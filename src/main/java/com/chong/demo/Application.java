package com.chong.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.chong.batch.base.db.DbDataManager;

@ComponentScan({ "com.chong.batch.base.db", "com.chong.batch.base.job" })
@SpringBootApplication
public class Application implements ApplicationRunner {
    @Autowired
    private DbDataManager dbDataManager;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String tableName = "student";
        // 导入
        // String importFilePath = "C:\\Users\\31238\\OneDrive\\デスクトップ\\test.csv";
        // dbDataManager.batchImportData(importFilePath, tableName);
        // 导出
        String exportFilePath = "C:\\Users\\31238\\OneDrive\\デスクトップ\\test2.csv";
        dbDataManager.batchExportData(exportFilePath, tableName);
    }
}
