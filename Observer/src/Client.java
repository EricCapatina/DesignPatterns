public class Client
{
    public static void main(String[] args)
    {
        HallowenEventPublisher publisher = new HallowenEventPublisher();
        HallowenEventSubscribers halloweensub1 = new HallowenEventSubscribers(publisher);
        HallowenEventSubscribers halloweensub2 = new HallowenEventSubscribers(publisher);

        publisher.addSubscriber(halloweensub1);
        publisher.addSubscriber(halloweensub2);
        publisher.setEventInfo("Halloween Event started!");

    }
}
