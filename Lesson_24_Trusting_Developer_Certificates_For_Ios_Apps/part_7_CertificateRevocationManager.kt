class CertificateManager {
    fun revokeOldCertificate(certificateId: String) {
        println("Revoking old certificate with ID: $certificateId.")
    }
}

val certManager = CertificateManager()
certManager.revokeOldCertificate("OLD_CERT_ID")
