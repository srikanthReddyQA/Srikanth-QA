package weblib;

import java.util.HashMap;

public class cmm {

	
	private static cmm single_instance = null;
	public HashMap<String,String> CurrentTestData;
	public String CurrentTestCasename;
	public String CurrentModuleName;
	public String DataFilesPath;
	public String CurrentFolderPath;
	
    public static cmm getInstance()
    {
        if (single_instance == null) 
        	{
        	single_instance = new cmm();
        	
        	}
        return single_instance;
    }
}
