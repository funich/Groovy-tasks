def adults(def st){
    def result = [:]
    st.each{ k, v ->
        if( v >= 18 ){
          result.put( k, v )
        }
    }
    return result
}
return this