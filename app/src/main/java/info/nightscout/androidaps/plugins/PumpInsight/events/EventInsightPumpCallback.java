package info.nightscout.androidaps.plugins.PumpInsight.events;

import java.util.UUID;

import info.nightscout.androidaps.events.Event;

/**
 * Created by jamorham on 23/01/2018.
 */
public class EventInsightPumpCallback extends Event {

    public UUID request_uuid;
    public boolean success = false;
    public String message = null;

    public EventInsightPumpCallback() {
        request_uuid = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Event: " + request_uuid + " success: " + success + " msg: " + message;
    }

}
