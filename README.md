# geojson-plugin

Geojson plugin for OpenNMS which allows nodes to be searched  for and rendered using a geojson ReST service

specification: 

https://tools.ietf.org/html/rfc7946  The GeoJSON Format
http://geojson.org/

Intended to work with https://grafana.com/plugins/citilogics-geoloop-panel

```
{ "type": "FeatureCollection",
  "features": [
    {
      "type": "Feature",
      "properties": {
        "STATE": "New Mexico",
        "STATE_CODE": 29,
        "CLIMDIV": 2905,
        "NAME": "CENTRAL VALLEY",
        ...
      },
      "geometry": {
        "type": "Polygon",
        "coordinates": [
          [
            [ -105.87799800030689, 33.24399899955506 ],
            [ -105.98500100019538, 33.269000999597324 ],
            ...
          ]
        ]
      }
    },
    {
      "type": "Feature",
      "properties": {
        "STATE": "New Mexico",
        "STATE_CODE": 29,
        "CLIMDIV": 2906,
        "NAME": "CENTRAL HIGHLANDS",
        ...
      },
      "geometry": {
        "type": "Polygon",
        "coordinates": [
          [
            [ -105.14900200004166, 32.63999899975494 ],
            [ -105.22300000044908, 32.5630000003506 ],
            ...
          ]
        ]
      }
    },
    ...
  ]
}
```

current plugin installs and responds to http://localhost:8980/opennms/plugin/geojson/v1-0/geojson/nodes


## Version
0.1 NOT YET COMPLETE 
