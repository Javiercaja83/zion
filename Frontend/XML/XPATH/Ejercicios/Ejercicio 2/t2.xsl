<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:output method="html" indent="yes"/>

<xsl:template match="/">

    <html>
    <body>
        
        <h2>Ejercicio 1</h2>
        <table border="1">
            <tr>
                <th>Cancion</th>
                <th>Artista</th>
                <th>Disco</th>
            </tr>

            <xsl:for-each select="//archivo[artista='Megadeth']">
                <tr>
                    <td><xsl:value-of select="cancion"/></td>
                    <td><xsl:value-of select="artista"/></td>
                    <td><xsl:value-of select="disco"/></td>
                </tr>
            </xsl:for-each>
        </table>

        <h2>Ejercicio 2</h2>
        <table border="1">
            <tr>
                <th>Cadena</th>
                <th>Cancion</th>
                <th>Artista</th>
                <th>Disco</th>
            </tr>

            <xsl:for-each select="//archivo[artista='Megadeth' or artista='Metallica']">
                
                <xsl:sort select="cancion"/>

                <tr>
                    <td>
                        <xsl:choose>
                            <xsl:when test="artista='Megadeth'">MGT</xsl:when>
                            <xsl:when test="artista='Metallica'">MET</xsl:when>
                        </xsl:choose>
                    </td>

                    <td><xsl:value-of select="cancion"/></td>
                    <td><xsl:value-of select="artista"/></td>
                    <td><xsl:value-of select="disco"/></td>
                </tr>

            </xsl:for-each>
        </table>

    </body>
    </html>

</xsl:template>
</xsl:stylesheet>