package greeting

import ophan.thrift.componentEvent.Action
import ophan.thrift.componentEvent.ComponentEvent
import ophan.thrift.componentEvent.ComponentType
import ophan.thrift.componentEvent.ComponentV2
import ophan.thrift.nativeapp.Event
import ophan.thrift.nativeapp.EventType

expect object Platform {
    fun name(): String
}

fun hello(): String = "Hello from ${Platform.name()}!"

fun testEvent(): Event = Event.Builder()
        .eventId("ffdfdfdfdssfdsf")
        .eventType(EventType.COMPONENT_EVENT)
        .viewId("fdsafdafdsafdsafdsafdsa")
        .componentEvent(ComponentEvent.Builder()
                .component(ComponentV2.Builder()
                        .componentType(ComponentType.APP_SCREEN)
                        .id("testComponent")
                        .products(emptySet())
                        .campaignCode("testCampaignCode")
                        .labels(emptySet())
                        .build()
                )
                .action(Action.CLICK)
                .value("yes")
                .build()
        )
        .build()
