import java.util.*;

public class MAPcunstroctorANDmethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
    // RollNumber, Names
        map.put(101, "Priyansh");
        map.put(102, "Tanuja");
        map.put(103, "Tanveer");
        map.put(104, "Anuja");
        map.put(105, "Tanisha");
            System.out.println(map.size());
            System.out.println(map.isEmpty());
            System.out.println(map.containsKey(107 ));
            System.out.println(map.containsValue("Priyansh"));
            System.out.println(map.get(101));// gives value of the particular key.
            System.out.println(map.put(106, "Raghav"));// ans--> null, 
            System.out.println(map.put(103, "Ramesha"));// ans-->Tanveer, but Tanveer is replaced by Ramesha.
            //System.out.println(map.remove(101));
            //map.putAll(map2);// kisi or map ki sabhi values ko put kr skte ha.
            //map.clear();
        //Important Methods of Map--->
            map.keySet();
            Set<Integer> set = map.keySet();
            System.out.println(set);// yha pr map ki sabhi keys ka set array bn jayga.
            map.values();
            Collection<String> c = map.values();
            System.out.println(c );// yha prr map ki sabhi values aa jaygi.
            map.entrySet();
            // Set<Map.Entry<Integer, String>> entries = map.entrySet();
            // System.out.println(entries);// yaha pr key & values dono mil jate ha.
            System.out.println(map.getOrDefault(109, "unknown"));// default value.
            System.out.println(map.putIfAbsent(103, "Abhay"));
            //putIfAbsent does not replace the existing value.
            map.remove(101, "Aditya");// it only removes if there is same match of key,value.
            map.replace(101, "Sonu");//agar key already exist krti hogi to hi value replace hogi.
            map.replace(101, "Tanujing", "RAngbaaz");// only replace agar old value or key match krte ha.
            // Set<Map.Entry<Integer, String>> entries = map.entrySet();
            //     for(Map.Entry<Integer, String> entry : entries){
            //         Integer key = entry.getKey();
            //         String value = entry.getValue();
            //             System.out.println(key + ", " + value);
            //     }
            // Immutable map 
            Map<Integer, String> map2 = Map.of(202, "Ramesh", 203, "Arnav" );
            Set<Map.Entry<Integer, String >> entries = map2.entrySet();
                System.out.println(entries);
    }
}
