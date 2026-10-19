import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class DialingCodes {

    private Map<Integer, String> diCo = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return diCo;
    }

    public void setDialingCode(Integer code, String country) {
        diCo.put(code,country);
        return;
    }

    public String getCountry(Integer code) {
        return diCo.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        //Set<String> coun = diCo.values();
        if (!diCo.containsKey(code) && !diCo.containsValue(country)){
            this.setDialingCode(code,country);
            return;
        }
        return;
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entrada : diCo.entrySet()){
            if(entrada.getValue().equals(country)){
                return entrada.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer, String> entrada : diCo.entrySet()){
            if(entrada.getValue().equals(country)){
                diCo.remove(entrada.getKey());
                this.setDialingCode(code,country);
                return;
            }
        return;
        }
    }
}
