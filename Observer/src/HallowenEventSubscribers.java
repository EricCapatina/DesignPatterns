public class HallowenEventSubscribers implements IEventSubscriber
{
    private HallowenEventPublisher _publisher;

    public HallowenEventSubscribers(HallowenEventPublisher publisher)
    {
        _publisher = publisher;
    //  _publisher.addSubscriber(this);
    }

    @Override
    public void Update()
    {
        String inform = _publisher.getEventInfo();
        System.out.println("Subscriber: " + _publisher.getClass() + " got event news: " + inform);
    }
}
