fun saveToKeychain(key: String, value: String) {
    val keyStore: KeyStore = KeyStore.getInstance("AndroidKeyStore")
    keyStore.load(null)

    val secretKey = keyStore.getKey("your_key_alias", null)
    // Logic to save value using the secret key...
}
