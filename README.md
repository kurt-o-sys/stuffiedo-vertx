# stuffiedo-vertx

backend for stuffiedo


## configuration
```
{
   "auth-mgr": {"address": {"login":<login-address>,
                            "auth":<authorization-address>,
                            "logout":<logout-address>},
                "aud": <audience-key>,
                "secret": <secret key for jwt validation>,
                "algorithm": <algorithm used for jwt validation>},
   "durability": {},
   "webserver": {"web_root": <web_root>,
                 "index_page": <index_page>,
                 "host": <host>,
                 "port": <port>,
                 "static_files": <static_files>,
                 "route_matcher": <route_matcher>,
                 "gzip_files": <gzip_files>,

                 "ssl": <ssl>,
                 "key_store_password": <key_store_password>,
                 "key_store_path": <key_store_path>,

                 "bridge": <bridge>,
                 "inbound_permitted": <inbound_permitted>,
                 "outbound_permitted": <outbound_permitted>,
                 "sjs_config": <sjs_config>,
                 "auth_timeout": <auth_timeout>,
                 "auth_address": <auth_address - should match auth-mgr auth address>}
}
```
