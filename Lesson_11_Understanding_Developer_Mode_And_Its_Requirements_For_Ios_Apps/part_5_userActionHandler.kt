override fun onUserAction(action: UserAction) {
    Log.d(TAG, "User action received: $action")
    // Set a breakpoint here to examine the action
    handleUserAction(action)
}
