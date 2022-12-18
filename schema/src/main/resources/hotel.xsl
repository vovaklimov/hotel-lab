<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:hotel="http://vovaklimov.github.com/hotel/hotel"
                xmlns:room="http://vovaklimov.github.com/hotel/room"
                xmlns:client="http://vovaklimov.github.com/hotel/client"
                xmlns:booking="http://vovaklimov.github.com/hotel/booking"
                xmlns:common="http://vovaklimov.github.com/hotel/common"
                exclude-result-prefixes="hotel room client common booking">
    <xsl:strip-space elements="*"/>
    <xsl:output method="html" indent="yes" media-type="text/html;charset=UTF8"/>

    <xsl:template match="/">
        <html>
            <body>
                <h1>Hotel information</h1>
                <hr/>
                <h2>Hotel Rooms</h2>
                <xsl:for-each select="hotel:rooms">
                    <xsl:apply-templates select="room:room"/>
                </xsl:for-each>
                <xsl:for-each select="hotel:clients">
                    <xsl:apply-templates select="client:client"/>
                </xsl:for-each>
                <xsl:for-each select="hotel:bookings">
                    <xsl:apply-templates select="booking:booking"/>
                </xsl:for-each>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="room:room">
        <div>
            <h3>Room<xsl:value-of select="room:id"/>
            </h3>
            <ul>
                <li>Id:
                    <xsl:value-of select="room:id"/>
                </li>
                <li>Description:
                    <xsl:value-of select="room:description"/>
                </li>
                <li>Room number:
                    <xsl:value-of select="room:number"/>
                </li>
            </ul>
        </div>
    </xsl:template>

    <xsl:template match="client:client">
        <div>
            <h3>Client
                <xsl:value-of select="client:id"/>
            </h3>
            <p>Id:
                <xsl:value-of select="client:id"/>
            </p>
            <p>Name:
                <xsl:value-of select="client:name"/>
            </p>
            <xsl:apply-templates select="client:address"/>
            <p>Contacts:</p>
            <ul>
                <xsl:for-each select="client:contacts">
                    <xsl:apply-templates select="client:contact"/>
                </xsl:for-each>
            </ul>
        </div>
    </xsl:template>

    <xsl:template match="client:address">
        <div>
            <p>Address</p>
            <ul>
                <li>
                    Region:
                    <xsl:value-of select="common:region"/>
                </li>
                <li>
                    City:
                    <xsl:value-of select="common:city"/>
                </li>
                <li>
                    Street:
                    <xsl:value-of select="common:street"/>
                </li>
                <li>
                    Postal code:
                    <xsl:value-of select="common:postalCode"/>
                </li>
            </ul>
        </div>
    </xsl:template>

    <xsl:template match="client:contact">
        <li>
            <xsl:value-of select="client:email"/>
            <xsl:value-of select="client:phone"/>
        </li>
    </xsl:template>

    <xsl:template match="booking:booking">
        <div>
            <h3>Booking</h3>
            <ul>
                <li>Id:
                    <xsl:value-of select="booking:id"/>
                </li>
                <li>Room id:
                    <xsl:value-of select="booking:roomId"/>
                </li>
                <li>Client id:
                    <xsl:value-of select="booking:clientId"/>
                </li>
                <xsl:apply-templates select="booking:timeRange"/>
            </ul>
        </div>
    </xsl:template>

    <xsl:template match="booking:timeRange">
        <li>Time range:
            <span>from
                <xsl:value-of select="common:from"/>
            </span>
            ,
            <span>to
                <xsl:value-of select="common:to"/>
            </span>
        </li>
    </xsl:template>
</xsl:stylesheet>
