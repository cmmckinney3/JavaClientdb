/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporting;

/**
 *
 * @author chron
 */
public class ReportFormatter {
    
    String formattedOutput;
    
    public ReportFormatter(Object object, FormatType formatType){
        switch(formatType){
            case XML:
                formattedOutput =convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput =convertObjectToCSV(object);
        }
        
    }
    
    private String convertObjectToXML(Object object){
        return "XML : <XML>"+object.toString()+"<XML>";
    }
    
    private String convertObjectToCSV(Object object){
        return "CSV : <CSV>"+object.toString()+"<CSV>";
    }
    
    protected String getFormattedValue(){
        return formattedOutput;
    }
    
}
