# PlaywrightPoc
Poc to scrap websites with Playwright

## Troubleshooting
If a library missing or not installed message appears, [run the following commands](https://playwright.dev/java/docs/browsers):

```bash
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install"
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install-deps"