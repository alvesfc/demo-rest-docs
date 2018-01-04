org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/greeting?name=User'
    }
    response {
        status 200
        body("""
"Hello World"

  """)

    }
}