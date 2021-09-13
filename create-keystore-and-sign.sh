echo "requires running java11"
echo ' 
yum install nodejs -y
npm -g install randomstring'
randomstring
rm -rf my-release-key.jks
cp -rf Bisq/build/outputs/apk/release/Bisq-release-unsigned.apk .
cp -rf Bisq/build/outputs/apk/debug/Bisq-debug.apk .

keytool -genkey -v -keystore my-release-key.jks -alias alias_name -keyalg RSA -keysize 2048 -validity 10000
/home/Android/Sdk/build-tools/29.0.3/apksigner sign --ks my-release-key.jks --out RadioX-Remote.apk Bisq-release-unsigned.apk
 
