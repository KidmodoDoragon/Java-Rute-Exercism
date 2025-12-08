public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine= logLine;
    }

    public LogLevel getLogLevel() {
        int ini = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String extract = logLine.substring(ini+1,end);
        LogLevel res = switch(extract){
            case "INF" -> LogLevel.INFO;
            case "DBG" -> LogLevel.DEBUG;
            case "TRC" -> LogLevel.TRACE;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
        return res;
    }

    public String getOutputForShortLog() {
        String nivelLog = switch(this.getLogLevel()){
            case LogLevel.INFO -> "4" ;
            case LogLevel.DEBUG -> "2";
            case LogLevel.TRACE -> "1";
            case LogLevel.WARNING -> "5";
            case LogLevel.ERROR -> "6";
            case LogLevel.FATAL -> "42";
            case LogLevel.UNKNOWN -> "0" ;
        }; 
        String result = nivelLog + ":" + this.logLine.split(":")[1].trim();
        return result;
    }
}
