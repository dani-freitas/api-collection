package one.digitalinnovetion.appicolletction

data class funcinario(
    val nome: String = "",
    val salario: Double = 0.0,
    val TipoContratacao: String = ""
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}
