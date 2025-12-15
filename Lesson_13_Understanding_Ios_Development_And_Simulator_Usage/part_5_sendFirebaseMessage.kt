val message = RemoteMessage.Builder("some_topic")
    .setMessageId("msg_id_$random")
    .addData("key", "value")
    .build()

FirebaseMessaging.getInstance().send(message)
