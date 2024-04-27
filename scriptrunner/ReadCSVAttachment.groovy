import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.util.AttachmentUtils
import com.atlassian.jira.io.InputStreamConsumer

def issueManager = ComponentAccessor.getIssueManager()
def attachmentManager = ComponentAccessor.getAttachmentManager()

def issue = issueManager.getIssueObject("<DESIRED_ISSUE_KEY"); // e.g. SP-1

def attachments = attachmentManager.getAttachments(issue)

attachments.each{ attachment ->
  def fileName = attachment.fileName
  
  
  def filePath = AttachmentUtils.getAttachmentFile(attachment)
  def attachmentFile = new File(filePath)
  

}



import com.opencsv.CSVReader
@Grapes(
@Grab(group='com.opencsv', module='opencsv', version='4.2')
)
def filePath = '/path/to/file/test.csv'
def reader = new CSVReader(new FileReader(new File(filePath)))
def data= reader.collect { it }.with { rows ->
    def header = rows.head()
    def dataRows = rows.tail()

    dataRows.collect { row ->
        [header, row].transpose().collectEntries()
    }
}

data.each{row->
    // access any data from the row by the name of the header
    // for example, row['colHeader'] or row.colHeader
}



