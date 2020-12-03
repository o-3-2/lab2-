public class Stream {

    private int maxTimeOfStream;
    private String streamId;
    private int prioritet;

    public Stream(String streamId, int maxTimeOfStream, int prioritet) {
        this.streamId = streamId;
        this.maxTimeOfStream = maxTimeOfStream;
        this.prioritet = prioritet;
    }

    public String getStreamId() {
        return streamId;
    }

    public int getMaxTimeOfStream() {
        return maxTimeOfStream;
    }

    public boolean isTime() {
        if (maxTimeOfStream <= 0) {
            return false;
        }
        return true;
    }

    public void timeReduction() {
        maxTimeOfStream--;
    }

    public int getPrioritet() {
        return prioritet;
    }

    public void Change() {
        prioritet = 0;
    }


    public void setPrioritet(int prioritet) {
        this.prioritet = prioritet;
    }
}
