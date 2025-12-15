fun login(username: String, password: String) {
    if (username.isEmpty() || password.isEmpty()) {
        Log.e("LoginError", "Username or password is empty")
        return
    }
    // Proceed with login logic
}
