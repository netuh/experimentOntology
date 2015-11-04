/**
 */
package codingExperimentOntology.apparatus.util;

import codingExperimentOntology.apparatus.*;

import experimentOntology.planning.Apparatus;
import experimentOntology.planning.Artifact;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.apparatus.NewPackage4Package
 * @generated
 */
public class NewPackage4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage4Switch() {
		if (modelPackage == null) {
			modelPackage = NewPackage4Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NewPackage4Package.CODIGN_APPARATUS: {
				CodignApparatus codignApparatus = (CodignApparatus)theEObject;
				T result = caseCodignApparatus(codignApparatus);
				if (result == null) result = caseApparatus(codignApparatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.CODING_ARTIFACT: {
				CodingArtifact codingArtifact = (CodingArtifact)theEObject;
				T result = caseCodingArtifact(codingArtifact);
				if (result == null) result = caseCodignApparatus(codingArtifact);
				if (result == null) result = caseArtifact(codingArtifact);
				if (result == null) result = caseApparatus(codingArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.CODING_INSTRUMENT: {
				CodingInstrument codingInstrument = (CodingInstrument)theEObject;
				T result = caseCodingInstrument(codingInstrument);
				if (result == null) result = caseCodignApparatus(codingInstrument);
				if (result == null) result = caseArtifact(codingInstrument);
				if (result == null) result = caseApparatus(codingInstrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.RESOURCE_MONITOR_INSTRUMENT: {
				ResourceMonitorInstrument resourceMonitorInstrument = (ResourceMonitorInstrument)theEObject;
				T result = caseResourceMonitorInstrument(resourceMonitorInstrument);
				if (result == null) result = caseCodingInstrument(resourceMonitorInstrument);
				if (result == null) result = caseCodignApparatus(resourceMonitorInstrument);
				if (result == null) result = caseArtifact(resourceMonitorInstrument);
				if (result == null) result = caseApparatus(resourceMonitorInstrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.TIME_MONITOR_INSTRUMENT: {
				TimeMonitorInstrument timeMonitorInstrument = (TimeMonitorInstrument)theEObject;
				T result = caseTimeMonitorInstrument(timeMonitorInstrument);
				if (result == null) result = caseCodingInstrument(timeMonitorInstrument);
				if (result == null) result = caseCodignApparatus(timeMonitorInstrument);
				if (result == null) result = caseArtifact(timeMonitorInstrument);
				if (result == null) result = caseApparatus(timeMonitorInstrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = caseCodingInstrument(questionnaire);
				if (result == null) result = caseCodignApparatus(questionnaire);
				if (result == null) result = caseArtifact(questionnaire);
				if (result == null) result = caseApparatus(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE: {
				TimeMonitorByResource timeMonitorByResource = (TimeMonitorByResource)theEObject;
				T result = caseTimeMonitorByResource(timeMonitorByResource);
				if (result == null) result = caseTimeMonitorInstrument(timeMonitorByResource);
				if (result == null) result = caseCodingInstrument(timeMonitorByResource);
				if (result == null) result = caseCodignApparatus(timeMonitorByResource);
				if (result == null) result = caseArtifact(timeMonitorByResource);
				if (result == null) result = caseApparatus(timeMonitorByResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.TIME_MONITOR_BY_TASK: {
				TimeMonitorByTask timeMonitorByTask = (TimeMonitorByTask)theEObject;
				T result = caseTimeMonitorByTask(timeMonitorByTask);
				if (result == null) result = caseTimeMonitorInstrument(timeMonitorByTask);
				if (result == null) result = caseTaskRelated(timeMonitorByTask);
				if (result == null) result = caseCodingInstrument(timeMonitorByTask);
				if (result == null) result = caseCodignApparatus(timeMonitorByTask);
				if (result == null) result = caseArtifact(timeMonitorByTask);
				if (result == null) result = caseApparatus(timeMonitorByTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.TIME_MONITOR_BY_PROCESS: {
				TimeMonitorByProcess timeMonitorByProcess = (TimeMonitorByProcess)theEObject;
				T result = caseTimeMonitorByProcess(timeMonitorByProcess);
				if (result == null) result = caseTimeMonitorInstrument(timeMonitorByProcess);
				if (result == null) result = caseProcessRelated(timeMonitorByProcess);
				if (result == null) result = caseCodingInstrument(timeMonitorByProcess);
				if (result == null) result = caseCodignApparatus(timeMonitorByProcess);
				if (result == null) result = caseArtifact(timeMonitorByProcess);
				if (result == null) result = caseApparatus(timeMonitorByProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.TASK_RELATED: {
				TaskRelated taskRelated = (TaskRelated)theEObject;
				T result = caseTaskRelated(taskRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.PROCESS_RELATED: {
				ProcessRelated processRelated = (ProcessRelated)theEObject;
				T result = caseProcessRelated(processRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.QUESTIONARY_BY_TASK: {
				QuestionaryByTask questionaryByTask = (QuestionaryByTask)theEObject;
				T result = caseQuestionaryByTask(questionaryByTask);
				if (result == null) result = caseTaskRelated(questionaryByTask);
				if (result == null) result = caseQuestionnaire(questionaryByTask);
				if (result == null) result = caseCodingInstrument(questionaryByTask);
				if (result == null) result = caseCodignApparatus(questionaryByTask);
				if (result == null) result = caseArtifact(questionaryByTask);
				if (result == null) result = caseApparatus(questionaryByTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS: {
				QuestionnaireByProcess questionnaireByProcess = (QuestionnaireByProcess)theEObject;
				T result = caseQuestionnaireByProcess(questionnaireByProcess);
				if (result == null) result = caseProcessRelated(questionnaireByProcess);
				if (result == null) result = caseQuestionnaire(questionnaireByProcess);
				if (result == null) result = caseCodingInstrument(questionnaireByProcess);
				if (result == null) result = caseCodignApparatus(questionnaireByProcess);
				if (result == null) result = caseArtifact(questionnaireByProcess);
				if (result == null) result = caseApparatus(questionnaireByProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.QUESTION_CONTENT: {
				QuestionContent questionContent = (QuestionContent)theEObject;
				T result = caseQuestionContent(questionContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseQuestion(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage4Package.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseQuestion(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Codign Apparatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Codign Apparatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodignApparatus(CodignApparatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingArtifact(CodingArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingInstrument(CodingInstrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Monitor Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Monitor Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceMonitorInstrument(ResourceMonitorInstrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Monitor Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Monitor Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeMonitorInstrument(TimeMonitorInstrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Monitor By Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Monitor By Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeMonitorByResource(TimeMonitorByResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Monitor By Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Monitor By Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeMonitorByTask(TimeMonitorByTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Monitor By Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Monitor By Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeMonitorByProcess(TimeMonitorByProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRelated(TaskRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRelated(ProcessRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionary By Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionary By Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionaryByTask(QuestionaryByTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire By Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire By Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireByProcess(QuestionnaireByProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionContent(QuestionContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparatus(Apparatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NewPackage4Switch
