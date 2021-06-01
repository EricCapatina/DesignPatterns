public class HallowenEventPublisher extends EventsPublisher
{
    private String _eventInfo;

    public void setEventInfo(String event)
    {
          _eventInfo = event;
          this.notifySubscriber();
    }

    public String getEventInfo()
    {
        return _eventInfo;
    }
}
