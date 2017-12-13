#!/usr/bin/env bash
if [ "$1" == "" ]
then
  echo "Please provide the path to the application archive."
  exit 1
fi
echo -n "Creating Service Registry..."
{
  cf create-service -c '{}' p-service-registry standard service-registry
} &> /dev/null
until [ `cf service service-registry | grep -c "succeeded"` -eq 1  ]
do
  echo -n "."
done
echo
echo "Config Server created. Pushing application."
cf push xcs-service-registry -p "$@"
echo "Done!"