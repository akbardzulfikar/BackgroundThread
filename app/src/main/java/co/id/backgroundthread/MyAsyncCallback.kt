package co.id.backgroundthread

internal interface MyAsyncCallback {
    fun onPreExecute()
    fun onPostExecute(text: String)
}