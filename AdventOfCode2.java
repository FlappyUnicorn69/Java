public class AdventOfCode2 {
    public static void main(String[] args) throws IOException {
        String filePath = "AdventCode1.txt";
        List<Integer> list = new ArrayList<Integer>;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { 
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.trim().split("\\s+");
                if (parts.length == 2) {
                    leftList.add(Integer.parseInt(parts[0]));
                    rightList.add(Integer.parseInt(parts[1]));
                } else {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (NumberFormatException ex) {
        }

        int number = 0;

    }
}