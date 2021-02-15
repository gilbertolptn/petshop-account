package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/v1/account/2/status'
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body("""{"status":"regular"}""")
        headers {
            contentType(applicationJson())
        }
    }
}