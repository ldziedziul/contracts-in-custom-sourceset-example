package web

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name("cars_provider___cars_consumer___cars")
            description "should return cars"
            request {
                method GET()
                url("/cars")
            }
            response {
                body("""[{"brand":"Ford","model":"Mondeo"},{"brand":"Kia","model":"Optima"}]""")
                headers {
                    contentType('application/json')
                }
                status 200
            }
        }
]