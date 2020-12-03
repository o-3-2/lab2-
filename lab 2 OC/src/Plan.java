
import java.util.ArrayList;
import java.util.Random;

public class Plan {
    public static final int TIME = 5;
    ArrayList<Process> Processes;
    ArrayList<Stream> Streams;
    private int maxPrioritet = -1;
    private int k;

    public Plan() {
        Processes = new ArrayList<Process>();
        Random length = new Random();

        Streams = new ArrayList<Stream>();
        for (int i = 0; i < length.nextInt(7) + 1; i++) {
            int prioritet = length.nextInt(100) + 1;
            if (prioritet < maxPrioritet || maxPrioritet == -1) {
                maxPrioritet = prioritet;
                k = i;
            }
            Streams.add(new Stream("Ïîòîê " + (i + 1), 8 * i + 1, prioritet));
        }
    }

    public void Start() {
        int m = maxPrioritet;
        int j = 0;
        while (j < Streams.size()) {
            Streams.get(k).Change();
            m = 0;
            print(" ïðîöåññ", m);
            System.out.println();

            for (int l = 0; l < Streams.size(); l++) {
                if ((Streams.get(l).getPrioritet() < m || m == 0) && Streams.get(l).getPrioritet() != 0) {
                    print(" ïðèîñòîíîâëåí ", l);
                    System.out.println();
                    m = Streams.get(l).getPrioritet();
                    k = l;
                }
            }
            j++;

        }
    }

    public void print(String str, int i) {
        System.out.println(Streams.get(i).getStreamId() + " ïðèîðèòåò : "
                + Streams.get(i).getPrioritet() + " âðåìÿ: "
                + Streams.get(i).getMaxTimeOfStream()
                + str);
    }
}