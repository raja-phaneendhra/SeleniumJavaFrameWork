package Utils;

public class ExcelUtilsDemo {

	
	public static void main(String[] args) {
		
		String projectPath= System.getProperty("user.dir");
		ExcelUtils excel= new ExcelUtils(projectPath+"/excel/data.xlsx", "sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumeric(1, 1);
		excel.getCellDataString(2, 0);
	}
}
