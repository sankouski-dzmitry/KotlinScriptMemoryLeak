import javax.script.ScriptEngineManager

fun main() {
    for (i in 1..20) {
        val engine = ScriptEngineManager().getEngineByExtension("kts")

        engine.eval("println(\"$i\")")
    }

    while (true) {

    }
}
