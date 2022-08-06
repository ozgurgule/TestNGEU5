package day24;

import Utilities.ExcelUtil;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class ExcelUtilDemo {
    @Test
    public void readExcelFile(){
        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");
        System.out.println("qa3short.rowCount() = " + qa3short.rowCount());
        System.out.println("qa3short.columnCount() = " + qa3short.columnCount());
        System.out.println("qa3short.getDataList() = " + qa3short.getDataList());
        List<Map< String,String>> dataList = qa3short.getDataList();
        for (Map<String, String> stringStringMap : dataList) {
            System.out.println("\"onerow\" = " + "onerow");

        }
        System.out.println("\"dataList.get(2) = \" = " + "dataList.get(2) = ");


    }
}
